package com.example.fouillearcho.Repository;

import java.util.List;

public interface IDAO <T, PK>{
	List<T> findAll();

	T find(PK id);

	T create(T obj);

	void update(T obj);

	T delete(PK id);
}
