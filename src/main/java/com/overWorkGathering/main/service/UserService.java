package com.overWorkGathering.main.service;

import java.security.PrivateKey;
import java.util.List;
import java.util.stream.Collectors;


import com.overWorkGathering.main.utils.BizException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.overWorkGathering.main.DTO.UserDTO;
import com.overWorkGathering.main.entity.UserEntity;
import com.overWorkGathering.main.repository.UserRepository;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import javax.crypto.Cipher;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	ModelMapper modelMapper = new ModelMapper();

	private static String RSA_WEB_KEY = "_RSA_WEB_Key_"; // 개인키 session key
	private static String RSA_INSTANCE = "RSA"; // rsa transformation

	public void test() {
		List<UserEntity> userEntityList = userRepository.findAll();
		List<UserDTO> userDTOList = userEntityList.stream()
				.map(UserEntity -> modelMapper.map(UserEntity, UserDTO.class))
				.collect(Collectors.toList());		
		
		
	}

	public boolean auth(UserDTO userInfo) throws Exception{
		UserEntity user = userRepository.findByUserIdAndPw(userInfo.getUserId(), userInfo.getPw());

		if(ObjectUtils.isEmpty(user)){
			return false;
		};

		return true;
	}

	private String decryptRsa(PrivateKey privateKey, String securedValue) throws Exception {
 		Cipher cipher = Cipher.getInstance(RSA_INSTANCE);
 		byte[] encryptedBytes = hexToByteArray(securedValue);
 		cipher.init(Cipher.DECRYPT_MODE, privateKey);
 		byte[]  decryptedBytes = cipher.doFinal(encryptedBytes);
 		String decryptedValue = new String(decryptedBytes, "utf-8"); // 문자 인코딩 주의.
 		return decryptedValue;
 	}

	public static byte[] hexToByteArray(String hex) {
		if (hex == null || hex.length() % 2 != 0) {
			return new byte[]{};
		}

		byte[] bytes = new byte[hex.length() / 2];

		for ( int i = 0; i < hex.length(); i += 2){
			byte value = (byte) Integer.parseInt(hex.substring(i, i + 2), 16);
			bytes[(int) Math.floor(i / 2)] = value;
		}
		return bytes;
	}


}
