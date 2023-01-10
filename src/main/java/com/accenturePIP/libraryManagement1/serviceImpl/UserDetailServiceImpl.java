package com.accenturePIP.libraryManagement1.serviceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.accenturePIP.libraryManagement1.bean.User;
import com.accenturePIP.libraryManagement1.bean.UserDues;
import com.accenturePIP.libraryManagement1.dao.UserDetailRepo;
import com.accenturePIP.libraryManagement1.dao.UserRoleRepo;
import com.accenturePIP.libraryManagement1.entity.UserDetail;
import com.accenturePIP.libraryManagement1.entity.UserRole;
import com.accenturePIP.libraryManagement1.service.UserDetailService;

@Service
public class UserDetailServiceImpl implements UserDetailService{

	@Autowired
	 UserDetailRepo userDetailRepo;
	@Autowired
	UserRoleRepo roleRepo;
	@Override
	public User addUser(User user) {
		try
		{
		UserDetail userEntity=new UserDetail();
		userEntity.setName(user.getName());
		userEntity.setLoginId(user.getLoginId());
		userEntity.setPassword(user.getPassword());
		userEntity.setRole(user.getRole());
		userEntity.setMobile(user.getMobile());
		userEntity.setStatus(true);
		userEntity.setCreatedDate(new Date());
		userEntity=userDetailRepo.save(userEntity);
		user.setId(userEntity.getId());
		user.setName(userEntity.getName());
		user.setLoginId(userEntity.getLoginId());
		
		user.setCreateDate(userEntity.getCreatedDate());
		}
		catch(Exception e) {
			
		}
		
		// TODO Auto-generated method stub
		return user;
	}
	@Override
	public User findUserById(Integer id) {
		
		User usr=new User();
		try
		{
		Optional<UserDetail> userd= userDetailRepo.findById(id);
		if(userd.isPresent())
		{
			UserDetail usrDetail=userd.get();
			usr.setId(usrDetail.getId());
			usr.setName(usrDetail.getName());
			usr.setMobile(usrDetail.getMobile());
			
			usr.setRole(usrDetail.getRole());
			Optional<UserRole> roleName=roleRepo.findById(usrDetail.getRole());
			usr.setRoleName(roleName.get().getRole());
			usr.setStatus(usrDetail.isStatus());
			usr.setCreateDate(usrDetail.getCreatedDate());
		}
		
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return usr;
	}
	@Override
	public List<User> findUserByName(String name) {
		User user=null;
		List<User> usrLst1=new ArrayList<User>();
		if(name!=null&& name.length()>=3)
		{
			try
			{
		List<Object[]> usrLst=	userDetailRepo.findUsersByName(name);
		for(Object[] obj: usrLst)
		{
			user=new User();
			System.out.println("user Id" +(Integer)obj[0]);
			user.setId((Integer)obj[0]);
			user.setName((String)obj[1]);
			user.setLoginId((String)obj[2]);
			user.setMobile((String)obj[3]);
			user.setCreateDate((Date)obj[4]);
			user.setStatus((Boolean)obj[5]);
			user.setRoleName((String)obj[6]);
			usrLst1.add(user);
			System.out.println("User detail from db==> "+user);
		}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		// TODO Auto-generated method stub
		return usrLst1;
	}
	@Override
	public List<UserDues> findUsersDuesList() {
		
		try
		{
			List<UserDues> userDuesList =new ArrayList<UserDues>();
			
			List<Object[]> usrList= userDetailRepo.findUsersDues();
			if(usrList!=null)
			{
				for(Object[] obj:usrList)
				{
					UserDues userDues =new UserDues();
					userDues.setUserId((Integer) obj[0]);
					userDues.setUserName((String) obj[1]);
					userDues.setUserRole((String) obj[2]);
					userDues.setCreatedDate((Date) obj[3]);
					userDues.setDuesFine((Double) obj[4]);
					userDues.setPaidFine((Double) obj[5]);
					userDuesList.add(userDues);
					
				}
			}
			return userDuesList;
		}catch(Exception e)
		{ e.printStackTrace();
		return null;}
		// TODO Auto-generated method stub
		
	}
	

}
