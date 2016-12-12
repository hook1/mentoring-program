package com.sluka.taras.dbLoader;

import com.sluka.taras.common.model.*;
import com.sluka.taras.common.model.enums.Sex;
import com.sluka.taras.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.ParseException;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


//@Service
public class GenerateDB {
//    @Autowired
    GroupsRepository groupsRepository;
//    @Autowired
    LevelRepository levelRepository;
//    @Autowired
    CategoryRepository categoryRepository;
//    @Autowired
    LectureRepository lectureRepository;
//    @Autowired
    LectureEventRepository lectureEventRepository;
//    @Autowired
    LocationRepository locationRepository;
//    @Autowired
    ProgramRepository programRepository;
//    @Autowired
    SubjectRepository subjectRepository;
//    @Autowired
    TechnologyRepository technologyRepository;
//    @Autowired
    MentorRepository mentorRepository;
//    @Autowired
    MenteeRepository menteeRepository;
//    @Autowired
    private RoleRepository roleRepository;
//    @Autowired
    private UserRepository userRepository;

    //    @PostConstruct
    public void onApplicationEvent() throws ParseException {
        Role adminRole = new Role();
        adminRole.setName("ADMIN");
        roleRepository.save(adminRole);

        Role userRole = new Role();
        userRole.setName("USER");
        roleRepository.save(userRole);

        Role lectorRole = new Role();
        lectorRole.setName("LECTOR");
        roleRepository.save(lectorRole);

        Role mentorRole = new Role();
        mentorRole.setName("MENTOR");
        roleRepository.save(mentorRole);

        Role menteeRole = new Role();
        menteeRole.setName("MENTEE");
        roleRepository.save(menteeRole);


        /*Admin*/
        /***************************************************/
        User admin = new User();
        admin.setUserName("admin");
        admin.setFirstName("admin");
        admin.setLastName("admin");
        admin.setEmail("admin@gmai.com");
        admin.setPassword("1111");
        admin.setSex(Sex.MALE);

        Set<Role> roles = new HashSet<>();
        roles.add(roleRepository.findById(1L));
        admin.setRoles((roles));

        UserDetail adminDetail1 = new UserDetail();
        adminDetail1.setBirthday(MyDate.getDateForString("19950619"));
        adminDetail1.setImg("/static/images/user/authorized/admin");

        ContactDetail aminContactDetail1 = new ContactDetail();
        aminContactDetail1.setHomeNumber("+380-32-111-11-11");
        aminContactDetail1.setPhoneNumber("+380-67-501-11-32");
        aminContactDetail1.setWorkNumber("+380-32-111-11-11");
        aminContactDetail1.setSkype("taras_sluka");

        adminDetail1.setContactDetail(aminContactDetail1);
        admin.setUserDetail(adminDetail1);

        userRepository.save(admin);
        /*User*/
        /***************************************************/
        User user1 = new User();
        user1.setUserName("user");
        user1.setFirstName("user");
        user1.setLastName("user");
        user1.setEmail("user@gmai.com");
        user1.setPassword("1111");
        user1.setSex(Sex.MALE);
        user1.getRoles().add(roleRepository.findById(2L));

        UserDetail userDetail1 = new UserDetail();
        userDetail1.setBirthday(MyDate.getDateForString("19540619"));
        userDetail1.setImg("/static/images/user/authorized/user1");

        ContactDetail userContactDetail1 = new ContactDetail();
        userContactDetail1.setHomeNumber("+380-32-111-11-11");
        userContactDetail1.setPhoneNumber("+380-67-501-11-32");
        userContactDetail1.setWorkNumber("+380-32-111-11-11");
        userContactDetail1.setSkype("taras_sluka");

        userDetail1.setContactDetail(userContactDetail1);
        user1.setUserDetail(userDetail1);

        userRepository.save(user1);

        /*Lector1*/
        /***************************************************/
        User lector1 = new User();
        lector1.setUserName("lector1");
        lector1.setFirstName("lector1");
        lector1.setLastName("lector1");
        lector1.setEmail("lector1@gmai.com");
        lector1.setPassword("1111");
        lector1.getRoles().add(roleRepository.findById(3L));
        lector1.setSex(Sex.FEMALE);
        UserDetail lectorDetail1 = new UserDetail();
        lectorDetail1.setBirthday(MyDate.getDateForString("19540619"));
        lectorDetail1.setImg("/static/images/user/authorized/lector1");

        ContactDetail lectorContactDetail1 = new ContactDetail();
        lectorContactDetail1.setHomeNumber("+380-32-111-11-11");
        lectorContactDetail1.setPhoneNumber("+380-67-501-11-32");
        lectorContactDetail1.setWorkNumber("+380-32-111-11-11");
        lectorContactDetail1.setSkype("taras_sluka");

        lectorDetail1.setContactDetail(lectorContactDetail1);
        lector1.setUserDetail(lectorDetail1);

        userRepository.save(lector1);


        /*Lector2*/
        /***************************************************/
        User lector2 = new User();
        lector2.setUserName("lector2");
        lector2.setFirstName("lector2");
        lector2.setLastName("lector2");
        lector2.setEmail("lector2@gmai.com");
        lector2.setPassword("1111");
        lector2.getRoles().add(roleRepository.findById(3L));
        lector2.setSex(Sex.MALE);
        UserDetail lectorDetail2 = new UserDetail();
        lectorDetail2.setBirthday(MyDate.getDateForString("19540619"));
        lectorDetail2.setImg("/static/images/user/authorized/lector2");

        ContactDetail lectorContactDetail2 = new ContactDetail();
        lectorContactDetail2.setHomeNumber("+380-32-111-11-11");
        lectorContactDetail2.setPhoneNumber("+380-67-501-11-32");
        lectorContactDetail2.setWorkNumber("+380-32-111-11-11");
        lectorContactDetail2.setSkype("taras_sluka");

        lectorDetail2.setContactDetail(lectorContactDetail2);
        lector2.setUserDetail(lectorDetail2);

        userRepository.save(lector2);

        /*Mentee1*/
        /***************************************************/

        User mentee1 = new User();
        mentee1.setUserName("mentee1");
        mentee1.setFirstName("mentee1");
        mentee1.setLastName("mentee1");
        mentee1.setEmail("mentee1@gmai.com");
        mentee1.setPassword("1111");
        mentee1.getRoles().add(roleRepository.findById(5L));
        mentee1.setSex(Sex.MALE);

        UserDetail menteeDetail1 = new UserDetail();
        menteeDetail1.setBirthday(MyDate.getDateForString("19540619"));
        menteeDetail1.setImg("/static/images/user/authorized/mentee1");

        ContactDetail menteeContactDetail1 = new ContactDetail();
        menteeContactDetail1.setHomeNumber("+380-32-111-11-11");
        menteeContactDetail1.setPhoneNumber("+380-67-501-11-32");
        menteeContactDetail1.setWorkNumber("+380-32-111-11-11");
        menteeContactDetail1.setSkype("taras_sluka");

        menteeDetail1.setContactDetail(menteeContactDetail1);
        mentee1.setUserDetail(menteeDetail1);

        userRepository.save(mentee1);


        /*Mentee2*/
        /***************************************************/

        User mentee2 = new User();
        mentee2.setUserName("mentee2");
        mentee2.setFirstName("mentee2");
        mentee2.setLastName("mentee2");
        mentee2.setEmail("mentee2@gmai.com");
        mentee2.setPassword("1111");
        mentee2.getRoles().add(roleRepository.findById(5L));
        mentee2.setSex(Sex.MALE);

        UserDetail menteeDetail2 = new UserDetail();
        menteeDetail2.setBirthday(MyDate.getDateForString("19540619"));
        menteeDetail2.setImg("/static/images/user/authorized/mentee2");

        ContactDetail menteeContactDetail2 = new ContactDetail();
        menteeContactDetail2.setHomeNumber("+380-32-111-11-11");
        menteeContactDetail2.setPhoneNumber("+380-67-501-11-32");
        menteeContactDetail2.setWorkNumber("+380-32-111-11-11");
        menteeContactDetail2.setSkype("taras_sluka");

        menteeDetail2.setContactDetail(menteeContactDetail2);
        mentee2.setUserDetail(menteeDetail2);


        userRepository.save(mentee2);


        /*Mentee3*/
        /***************************************************/
        User mentee3 = new User();
        mentee3.setUserName("mentee3");
        mentee3.setFirstName("mentee3");
        mentee3.setLastName("mentee3");
        mentee3.setEmail("mentee3@gmai.com");
        mentee3.setPassword("1111");
        mentee3.getRoles().add(roleRepository.findById(5L));
        mentee3.setSex(Sex.MALE);

        UserDetail menteeDetail3 = new UserDetail();
        menteeDetail3.setBirthday(MyDate.getDateForString("19540619"));
        menteeDetail3.setImg("/static/images/user/authorized/mentee3");

        ContactDetail menteeContactDetail3 = new ContactDetail();
        menteeContactDetail3.setHomeNumber("+380-32-111-11-11");
        menteeContactDetail3.setPhoneNumber("+380-67-501-11-32");
        menteeContactDetail3.setWorkNumber("+380-32-111-11-11");
        menteeContactDetail3.setSkype("taras_sluka");

        menteeDetail3.setContactDetail(menteeContactDetail3);
        mentee3.setUserDetail(menteeDetail3);

        userRepository.save(mentee3);

        /*Mentee4*/
        /***************************************************/
        User mentee4 = new User();
        mentee4.setUserName("mentee4");
        mentee4.setFirstName("mentee4");
        mentee4.setLastName("mentee4");
        mentee4.setEmail("mentee4@gmai.com");
        mentee4.setPassword("1111");
        mentee4.getRoles().add(roleRepository.findById(5L));
        mentee4.setSex(Sex.MALE);

        UserDetail menteeDetail4 = new UserDetail();
        menteeDetail4.setBirthday(MyDate.getDateForString("19540619"));
        menteeDetail4.setImg("/static/images/user/authorized/mentee4");

        ContactDetail menteeContactDetail4 = new ContactDetail();
        menteeContactDetail4.setHomeNumber("+380-32-111-11-11");
        menteeContactDetail4.setPhoneNumber("+380-67-501-11-32");
        menteeContactDetail4.setWorkNumber("+380-32-111-11-11");
        menteeContactDetail4.setSkype("taras_sluka");

        menteeDetail4.setContactDetail(menteeContactDetail4);
        mentee4.setUserDetail(menteeDetail4);

        userRepository.save(mentee4);

        /*Mentor1*/
        /***************************************************/
        User mentor1 = new User();
        mentor1.setUserName("mentor1");
        mentor1.setFirstName("mentor1");
        mentor1.setLastName("mentor1");
        mentor1.setEmail("mentor1@gmai.com");
        mentor1.setPassword("1111");
        mentor1.getRoles().add(roleRepository.findById(4L));
        mentor1.setSex(Sex.MALE);

        UserDetail mentorDetail1 = new UserDetail();
        mentorDetail1.setBirthday(MyDate.getDateForString("19540619"));
        mentorDetail1.setImg("/static/images/user/authorized/mentor1");

        ContactDetail mentorContactDetail1 = new ContactDetail();
        mentorContactDetail1.setHomeNumber("+380-32-111-11-11");
        mentorContactDetail1.setPhoneNumber("+380-67-501-11-32");
        mentorContactDetail1.setWorkNumber("+380-32-111-11-11");
        mentorContactDetail1.setSkype("taras_sluka");

        mentorDetail1.setContactDetail(mentorContactDetail1);
        mentor1.setUserDetail(mentorDetail1);

        userRepository.save(mentor1);

        /*Mentor2*/
        /***************************************************/
        User mentor2 = new User();
        mentor2.setUserName("mentor2");
        mentor2.setFirstName("mentor2");
        mentor2.setLastName("mentor2");
        mentor2.setEmail("mentor2@gmai.com");
        mentor2.setPassword("1111");
        mentor2.getRoles().add(roleRepository.findById(4L));
        mentor2.setSex(Sex.MALE);

        UserDetail mentorDetail2 = new UserDetail();
        mentorDetail2.setBirthday(MyDate.getDateForString("19540619"));
        mentorDetail2.setImg("/static/images/user/authorized/mentor2");

        ContactDetail mentorContactDetail2 = new ContactDetail();
        mentorContactDetail2.setHomeNumber("+380-32-111-11-11");
        mentorContactDetail2.setPhoneNumber("+380-67-501-11-32");
        mentorContactDetail2.setWorkNumber("+380-32-111-11-11");
        mentorContactDetail2.setSkype("taras_sluka");

        mentorDetail2.setContactDetail(mentorContactDetail2);
        mentor2.setUserDetail(mentorDetail2);

        userRepository.save(mentor2);

        /*Mentor3*/
        /***************************************************/

        User mentor3 = new User();
        mentor3.setUserName("mentor3");
        mentor3.setFirstName("mentor3");
        mentor3.setLastName("mentor3");
        mentor3.setEmail("mentor3@gmai.com");
        mentor3.setPassword("1111");
        mentor3.getRoles().add(roleRepository.findById(4L));
        mentor3.setSex(Sex.MALE);

        UserDetail mentorDetail3 = new UserDetail();
        mentorDetail3.setBirthday(MyDate.getDateForString("19540619"));
        mentorDetail3.setImg("/static/images/user/authorized/mentor3");

        ContactDetail mentorContactDetail3 = new ContactDetail();
        mentorContactDetail3.setHomeNumber("+380-32-111-11-11");
        mentorContactDetail3.setPhoneNumber("+380-67-501-11-32");
        mentorContactDetail3.setWorkNumber("+380-32-111-11-11");
        mentorContactDetail3.setSkype("taras_sluka");

        mentorDetail3.setContactDetail(mentorContactDetail3);
        mentor3.setUserDetail(mentorDetail3);

        userRepository.save(mentor3);



        /*Program level*/
        /***************************************************/
        Level level1 = new Level();
        level1.setName("P1");
        level1.setDescription("");
        levelRepository.save(level1);

        Level level2 = new Level();
        level2.setName("P2");
        level2.setDescription("");
        levelRepository.save(level2);


        Level level3 = new Level();
        level3.setName("P3");
        level3.setDescription("");
        levelRepository.save(level3);

        Level level4 = new Level();
        level4.setName("P4");
        level4.setDescription("");
        levelRepository.save(level4);

        Level level5 = new Level();
        level5.setName("P5");
        level5.setDescription("");
        levelRepository.save(level5);

        Level level6 = new Level();
        level6.setName("P6");
        level6.setDescription("");
        levelRepository.save(level6);

        Level level7 = new Level();
        level7.setName("P7");
        level7.setDescription("");
        levelRepository.save(level7);

        /*Location*/
        /***************************************************/
        Location location1 = new Location();
        location1.setCountry("Україна");
        location1.setRegion("Львівська");
        location1.setArea("Франківський");
        location1.setCity("Львів");
        location1.setStreat("Lukasha");
        location1.setBuilding(2);
        location1.setLevel(3);
        location1.setOffise(32);
        locationRepository.save(location1);

        Location location2 = new Location();
        location2.setCountry("Україна");
        location2.setRegion("Львівська");
        location2.setArea("Галицький");
        location2.setCity("Львів");
        location2.setStreat("С. Бандери");
        location2.setBuilding(5);
        location2.setLevel(8);
        location2.setOffise(807);
        locationRepository.save(location2);

        Location location3 = new Location();
        location3.setCountry("Україна");
        location3.setRegion("Львівська");
        location3.setArea("Залізничний");
        location3.setCity("Львів");
        location3.setStreat("Lukasha");
        location3.setBuilding(2);
        location3.setLevel(4);
        location3.setOffise(403);
        locationRepository.save(location3);

        Location location4 = new Location();
        location4.setCountry("Україна");
        location4.setRegion("Львівська");
        location4.setArea("Франківський");
        location4.setCity("Львів");
        location4.setStreat("Lukasha");
        location4.setBuilding(2);
        location4.setLevel(3);
        location4.setOffise(302);
        locationRepository.save(location4);

        Location location5 = new Location();
        location5.setCountry("Україна");
        location5.setRegion("Львівська");
        location5.setArea("Франківський");
        location5.setCity("Львів");
        location5.setStreat("Lukasha");
        location5.setBuilding(3);
        location5.setLevel(5);
        location5.setOffise(505);
        locationRepository.save(location5);


          /*Technology*/
        /***************************************************/
        Technology technology1 = new Technology();
        technology1.setName("spring-data-jpa");
        technologyRepository.save(technology1);

        Technology technology2 = new Technology();
        technology1.setName("spring-security");
        technologyRepository.save(technology2);

        Technology technology3 = new Technology();
        technology1.setName("spring-aop");
        technologyRepository.save(technology3);

        Technology technology4 = new Technology();
        technology1.setName("tomcat");
        technologyRepository.save(technology4);

        Technology technology5 = new Technology();
        technology1.setName("MySQL");
        technologyRepository.save(technology5);





        /*Subject*/
        /***************************************************/
        Subject subject1 = new Subject();
        subject1.setLevel(level1);
//        subject1.setTechnology();
        subjectRepository.save(subject1);

        Subject subject2 = new Subject();
        subject2.setLevel(level1);
//        subject2.getLectures().add(lecture3);
//        subject2.getLectures().add(lecture4);
        subjectRepository.save(subject2);

        Subject subject3 = new Subject();
        subject3.setLevel(level1);
//        subject3.getLectures().add(lecture5);
//        subject3.getLectures().add(lecture6);
        subjectRepository.save(subject3);

         /*Lecture*/
        /***************************************************/
        Lecture lecture1 = new Lecture();
        lecture1.setName("Introduction java");
        lecture1.setSrcPathTheory("/static/levlel/D1/java/core/");
        lecture1.setSrcPathTask("/static/levlel/D1/core/");
        lecture1.setSubject(subject1);
        lectureRepository.save(lecture1);

        Lecture lecture2 = new Lecture();
        lecture2.setName("Introduction css");
        lecture2.setSrcPathTheory("/static/levlel/D1/java/core/");
        lecture2.setSrcPathTask("/static/levlel/D1/java/core/");
        lecture1.setSubject(subject1);
        lectureRepository.save(lecture2);

        Lecture lecture3 = new Lecture();
        lectureRepository.save(lecture3);

        Lecture lecture4 = new Lecture();
        lectureRepository.save(lecture4);

        Lecture lecture5 = new Lecture();
        lectureRepository.save(lecture5);

        Lecture lecture6 = new Lecture();
        lectureRepository.save(lecture6);


        /*LectureEvent*/
        /***************************************************/

        LectureEvent lectureEvent1 = new LectureEvent();
        lectureEvent1.setDate(new Date());
        lectureEvent1.setPlanDate(new Date());
        lectureEvent1.setStatus(false);
        lectureEvent1.setLocation(location1);
        lectureEvent1.setSpeaker(lector1);
        lectureEvent1.setLecture(lecture1);
        lectureEventRepository.save(lectureEvent1);

        LectureEvent lectureEvent2 = new LectureEvent();
        lectureEvent2.setDate(new Date());
        lectureEvent2.setPlanDate(new Date());
        lectureEvent2.setStatus(false);
        lectureEvent2.setLocation(location1);
        lectureEvent2.setSpeaker(lector1);
        lectureEvent2.setLecture(lecture1);
        lectureEventRepository.save(lectureEvent2);

        LectureEvent lectureEvent3 = new LectureEvent();
        lectureEvent3.setDate(new Date());
        lectureEvent3.setPlanDate(new Date());
        lectureEvent3.setStatus(false);
        lectureEvent3.setLocation(location1);
        lectureEvent3.setSpeaker(lector1);
        lectureEvent3.setLecture(lecture1);
        lectureEventRepository.save(lectureEvent3);

        LectureEvent lectureEvent4 = new LectureEvent();
        lectureEvent4.setDate(new Date());
        lectureEvent4.setPlanDate(new Date());
        lectureEvent4.setStatus(false);
        lectureEvent4.setLocation(location1);
        lectureEvent4.setSpeaker(lector1);
        lectureEvent4.setLecture(lecture1);
        lectureEventRepository.save(lectureEvent4);

        LectureEvent lectureEvent5 = new LectureEvent();
        lectureEvent5.setDate(new Date());
        lectureEvent5.setPlanDate(new Date());
        lectureEvent5.setStatus(false);
        lectureEvent5.setLocation(location1);
        lectureEvent5.setSpeaker(lector1);
        lectureEvent5.setLecture(lecture1);
        lectureEventRepository.save(lectureEvent5);

        LectureEvent lectureEvent6 = new LectureEvent();
        lectureEvent6.setDate(new Date());
        lectureEvent6.setPlanDate(new Date());
        lectureEvent6.setStatus(false);
        lectureEvent6.setLocation(location1);
        lectureEvent6.setSpeaker(lector1);
        lectureEvent6.setLecture(lecture1);
        lectureEventRepository.save(lectureEvent6);


        /*Groups*/
        /***************************************************/
        Groups group1 = new Groups();
        group1.setCurarot(admin);
        group1.setName("Java D1");
        groupsRepository.save(group1);

        Groups group2 = new Groups();
        group2.setCurarot(admin);
        group2.setName("Java D2");
        groupsRepository.save(group2);


        /*Participant*/
        /***************************************************/
/*
        Participant participant1 = new Participant();
        participant1.setGroups(group1);
        participantRepository.save(participant1);

        Participant participant2 = new Participant();
        participant2.setGroups(group1);
        participantRepository.save(participant2);

        Participant participant3 = new Participant();
        participant3.setGroups(group1);
        participantRepository.save(participant3);


        Participant participant4 = new Participant();
        participant4.setGroups(group1);
        participantRepository.save(participant4);
*/


        /*Mentor*/
        /***************************************************/
        Mentor mentor11 = new Mentor();
        mentor11.setGroups(group1);
        mentor11.setMentor(mentor1);
        mentorRepository.save(mentor11);

        Mentor mentor22 = new Mentor();
        mentor22.setGroups(group1);
        mentor22.setMentor(mentor2);
        mentorRepository.save(mentor22);

         /*Mentee*/
        /***************************************************/

        Mentee mentee11 = new Mentee();
        mentee11.setGroups(group1);
        mentee11.setMentor(mentor11);
        mentee11.setMentee(mentee1);
        menteeRepository.save(mentee11);

        Mentee mentee22 = new Mentee();
//        mentee22.setGroups(group1);
//        mentee22.setMentor(mentor11);
        menteeRepository.save(mentee22);

        Mentee mentee33 = new Mentee();
//        mentee33.setGroups(group1);
//        mentee33.setMentor(mentor11);
        menteeRepository.save(mentee33);

        Mentee mentee44 = new Mentee();
//        mentee44.setGroups(group1);
//        mentee44.setMentor(mentor22);
        menteeRepository.save(mentee44);


//        mentor11.getMentee().add(mentee11);
//        mentor11.getMentee().add(mentee22);
//        mentor11.getMentee().add(mentee33);
//        mentor22.getMentee().add(mentee11);
        /*Program*/
        /***************************************************/
//        group1.getParticipants().add(participant1);
//        group1.getParticipants().add(participant2);
//        group1.getParticipants().add(participant3);
//        group1.getParticipants().add(participant4);

    }
}
