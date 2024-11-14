package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.Repository.DataRepo;
import com.app.model.Data;

@RestController
public class DataController {
	
	@Autowired
	DataRepo dr;
	
	@GetMapping("/data")
	public List<Data> getData()
	{
		return dr.findAll();
	}
	@GetMapping("/data/{id}")
	public Data getDatabyId(@PathVariable int id)
	{
		Data data=dr.findById(id).get();
		return data;
	}
	@PostMapping("/data/add")
	public void addData(@RequestBody Data data)
	{
		dr.save(data);
	}
	@PutMapping("/data/update/{id}")
	public Data updataData(@PathVariable int id,@RequestBody Data data1)
	{
		Data data=dr.findById(id).get();
		data.setName(data1.getName());
		data.setAge(data1.getAge());
		return data;
	}
	@DeleteMapping("/data/delete/{id}")
	public void deleteData(@PathVariable int id)
	{
		dr.deleteById(id);
	}

//	@Autowired
//	DataRepo dr;
//	@GetMapping("/data")
//	public List<Data> getData()
//	{
//		List<Data> data=dr.findAll();
//		return data;
//	}
//	@GetMapping("/data/{id}")
//	public Data getDatabyId(@PathVariable int id)
//	{
//		Data data=dr.findById(id).get();
//		return data;
//	}
//	
//	@PostMapping("/data/add")
//	public void add(@RequestBody Data data)
//	{
//		dr.save(data);
//	}
//	@PutMapping("/data/update/{id}")
//	public Data updateData(@PathVariable int id,@RequestBody Data data1)
//	{
//		Data data=dr.findById(id).get();
//		data.setName(data1.getName());
//		data.setAge(data1.getAge());
//		dr.save(data);
//		return data;
//	}
//	
//	@DeleteMapping("/data/delete/{id}")
//	public void deleteData(@PathVariable int id)
//	{
//		dr.deleteById(id);
//	}
}
