package com.sluka.taras.buisness.dbLoader;

import com.sluka.taras.common.model.Role;
import com.sluka.taras.common.model.Sex;
import com.sluka.taras.common.model.User;
import com.sluka.taras.repositories.RoleRepository;
import com.sluka.taras.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.text.ParseException;
import java.util.HashSet;
import java.util.Set;


@Service
public class GenerateRoleAndUser {
    @Autowired
    private RoleRepository roleDao;
    @Autowired
    private UserRepository userDao;

    @PostConstruct
    public void onApplicationEvent() throws ParseException {
        Role adminRole = new Role();
        adminRole.setName("ADMIN");
        roleDao.save(adminRole);

        Role userRole = new Role();
        userRole.setName("USER");
        roleDao.save(userRole);

        Role lectorRole = new Role();
        lectorRole.setName("LECTOR");
        roleDao.save(lectorRole);

        Role mentorRole = new Role();
        mentorRole.setName("MENTOR");
        roleDao.save(mentorRole);

        Role menteeRole = new Role();
        menteeRole.setName("MENTEE");
        roleDao.save(menteeRole);

        User admin = new User();
        admin.setUserName("admin");
        admin.setFirstName("admin");
        admin.setLastName("admin");
        admin.setEmail("admin@gmai.com");
        admin.setPassword("1111");
//        admin.getUserDetail().setBirthday(MyDate.getDateForString("19540619"));
//        admin.getUserDetail().setImg("/static/images/user/authorized/admin");
//        admin.getUserDetail().getContactDetail().setHomeNumber("+380-32-111-11-11");
//        admin.getUserDetail().getContactDetail().setPhoneNumber("+380-67-501-11-32");
//        admin.getUserDetail().getContactDetail().setWorkNumber("+380-32-111-11-11");
//        admin.getUserDetail().getContactDetail().setSkype("taras_sluka");
        admin.setSex(Sex.MALE);
        Set<Role> roles = new HashSet<>();
        roles.add(roleDao.findById(1L));
        admin.setRoles((roles));
        userDao.save(admin);

        User user = new User();
        user.setUserName("user");
        user.setFirstName("user");
        user.setLastName("user");
        user.setEmail("user@gmai.com");
        user.setPassword("1111");
        user.getRoles().add(roleDao.findById(2L));
        userDao.save(user);

        User lector1 = new User();
        lector1.setUserName("lector1");
        lector1.setFirstName("lector1");
        lector1.setLastName("lector1");
        lector1.setEmail("lector1@gmai.com");
        lector1.setPassword("1111");
        lector1.getRoles().add(roleDao.findById(3L));
        userDao.save(lector1);

        User lector2 = new User();
        lector2.setUserName("lector2");
        lector2.setFirstName("lector2");
        lector2.setLastName("lector2");
        lector2.setEmail("lector2@gmai.com");
        lector2.setPassword("1111");
        lector2.getRoles().add(roleDao.findById(3L));
        userDao.save(lector2);

        User mentee1 = new User();
        mentee1.setUserName("mentee1");
        mentee1.setFirstName("mentee1");
        mentee1.setLastName("mentee1");
        mentee1.setEmail("mentee1@gmai.com");
        mentee1.setPassword("1111");
        mentee1.getRoles().add(roleDao.findById(5L));
        userDao.save(mentee1);

        User mentee2 = new User();
        mentee2.setUserName("mentee2");
        mentee2.setFirstName("mentee2");
        mentee2.setLastName("mentee2");
        mentee2.setEmail("mentee2@gmai.com");
        mentee2.setPassword("1111");
        mentee2.getRoles().add(roleDao.findById(5L));
        userDao.save(mentee2);

        User mentee3 = new User();
        mentee3.setUserName("mentee3");
        mentee3.setFirstName("mentee3");
        mentee3.setLastName("mentee3");
        mentee3.setEmail("mentee3@gmai.com");
        mentee3.setPassword("1111");
        mentee3.getRoles().add(roleDao.findById(5L));
        userDao.save(mentee3);

        User mentee4 = new User();
        mentee4.setUserName("mentee4");
        mentee4.setFirstName("mentee4");
        mentee4.setLastName("mentee4");
        mentee4.setEmail("mentee4@gmai.com");
        mentee4.setPassword("1111");
        mentee4.getRoles().add(roleDao.findById(5L));
        userDao.save(mentee4);

        User mentor1 = new User();
        mentor1.setUserName("mentor1");
        mentor1.setFirstName("mentor1");
        mentor1.setLastName("mentor1");
        mentor1.setEmail("mentor1@gmai.com");
        mentor1.setPassword("1111");
        mentor1.getRoles().add(roleDao.findById(4L));
        userDao.save(mentor1);

        User mentor2 = new User();
        mentor2.setUserName("mentor2");
        mentor2.setFirstName("mentor2");
        mentor2.setLastName("mentor2");
        mentor2.setEmail("mentor2@gmai.com");
        mentor2.setPassword("1111");
        mentor2.getRoles().add(roleDao.findById(4L));
        userDao.save(mentor2);

        User mentor3 = new User();
        mentor3.setUserName("mentor3");
        mentor3.setFirstName("mentor3");
        mentor3.setLastName("mentor3");
        mentor3.setEmail("mentor3@gmai.com");
        mentor3.setPassword("1111");
        mentor3.getRoles().add(roleDao.findById(4L));
        userDao.save(mentor3);
    }

}
