package com.example.demo;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.ThingsLearned;
import com.example.demo.repository.PlayerRepository;
import com.example.demo.repository.ThingsLearnedRepository;
import com.example.demo.repository.VehilcleRepository;

import net.sf.ehcache.CacheManager;

@SpringBootApplication
public class HibernateApplication implements CommandLineRunner {
	
	@Autowired
	PlayerRepository playerRepo;
	
	@Autowired
	VehilcleRepository vehicleRepo;
	
	@Autowired
	VehilcleRepository vehicleRepo2;
	
	@Autowired
	ThingsLearnedRepository learnedRepo;
	

	public static void main(String[] args) {
		SpringApplication.run(HibernateApplication.class, args).close();
	}

	@Override
	public void run(String... args) throws Exception {
		
//		Vehicle vehicle = new Vehicle();
//		vehicle.setVehicleName("1=1");
//		
//		TwoWheeler bike = new TwoWheeler();
//		bike.setVehicleName("CBZ");
//		bike.setTwoWheelerhandle("2");
//		
//		FourWheeler car = new FourWheeler();
//		car.setVehicleName("swift");
//		car.setFourWheelerHandle("4");
//		
//		vehicleRepo.save(vehicle);
//		vehicleRepo.save(bike);
//		vehicleRepo.save(car);
//		
//		Sort sort = new Sort(new Sort.Order(Direction.ASC, "vehicleId"));
//		Pageable pageable = new PageRequest(0,100, sort);
//		List<Vehicle> list = vehicleRepo.findAllVehicle("1=1",pageable);
//		
//		list.forEach(s->System.out.println(s.toString()));
//		
//		List<Vehicle> list2 = vehicleRepo.findByVehicleId(4L);
//		
//		list2.forEach(s->System.out.println(s.toString()));
//		
//		List<Vehicle> list3 = vehicleRepo.findByVehicleName("CBZ");
//		list3.forEach(s->System.out.println(s.toString()));
		
		
//		Vehicle vehicle = new Vehicle();
//		vehicle.setVehicleName("car");
//		vehicleRepo.save(vehicle);
//		int size=0;
//		try {
//			size =CacheManager.ALL_CACHE_MANAGERS.get(0).getCache("Vehicle") .getSize();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		System.err.println(size);
//		
//		List<Vehicle> list2 = vehicleRepo.findByVehicleId(4L);
//		System.err.println(CacheManager.ALL_CACHE_MANAGERS.get(0).getCache("Vehicle").toString());
//		
//		List<Vehicle> list22 = vehicleRepo.findByVehicleId(4L);
//		
//		List<Vehicle> list21 = vehicleRepo2.findByVehicleId(4L);
//		
//		playerRepo.findAll();
//		
//		 size = CacheManager.ALL_CACHE_MANAGERS.get(0).getCache("Vehicle").getSize();
//	 list21 = vehicleRepo2.findByVehicleId(4L);
//		System.err.println(size);
		
		ThingsLearned things = new ThingsLearned();
		things.setName("Hibernate");
		
		learnedRepo.save(things);
		try{System.err.println(CacheManager.ALL_CACHE_MANAGERS.get(0).getCache("ThingsLearned").getSize());}catch(Exception e) {}
		learnedRepo.findOne(1L);
		System.err.println(CacheManager.ALL_CACHE_MANAGERS.get(0).getCache("ThingsLearned").getSize());
		learnedRepo.findOne(1L);
		System.err.println(CacheManager.ALL_CACHE_MANAGERS.get(0).getCache("ThingsLearned").getSize());
		ThingsLearned things2 = new ThingsLearned();
		things2.setName("SpringBoot");
		learnedRepo.save(things2);
		
		ThingsLearned things3 = new ThingsLearned();
		things3.setName("Spring Cloud");
		learnedRepo.save(things3);
		
		System.err.println(CacheManager.ALL_CACHE_MANAGERS.get(0).getCache("ThingsLearned").getSize());
		learnedRepo.findOne(2L);
		System.err.println(CacheManager.ALL_CACHE_MANAGERS.get(0).getCache("ThingsLearned").getSize());
		learnedRepo.findOne(2L);
		
		System.err.println(CacheManager.ALL_CACHE_MANAGERS.get(0).getCache("ThingsLearned").getSize());
		learnedRepo.findOne(3L);
		
		System.err.println(CacheManager.ALL_CACHE_MANAGERS.get(0).getCache("ThingsLearned").getSize());
		learnedRepo.findOne(3L);
		System.err.println(CacheManager.ALL_CACHE_MANAGERS.get(0).getCache("ThingsLearned").getSize());
		learnedRepo.findOne(3L);
		
		learnedRepo.findAllLearned(1L);
		learnedRepo.findAllLearned(1L);
		learnedRepo.findAllLearned(1L);
		System.err.println(CacheManager.ALL_CACHE_MANAGERS.get(0).getCache("ThingsLearned").getSize());
		
		
	}
}
