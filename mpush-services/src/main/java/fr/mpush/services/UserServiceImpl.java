package fr.mpush.services;

import fr.mpush.facade.UserService;
import fr.mpush.facade.dto.ContactDTO;
import fr.mpush.facade.dto.UserDTO;
import fr.mpush.mapper.UserMapper;
import fr.mpush.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "customerService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDTO getUserByEmail(String email) {
        return userMapper.asUserDTO(userRepository.findByEmail(email));
    }

    @Override
    public UserDTO getUserById(Long id) {
        return userMapper.asUserDTO(userRepository.findOne(id));
    }

    @Override
    public List<UserDTO> listAllUsers() {
        return userMapper.asUserDTOList(userRepository.findAll());
    }

}