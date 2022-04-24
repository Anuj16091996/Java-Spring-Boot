package com.example.backend.DAO;

import com.example.backend.entities.Courses;
import com.example.backend.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface cookbookDAO extends JpaRepository<Users,Integer> {

    @Query(value = "SELECT e FROM Users e ORDER BY e.fullName desc ")
    public List<Users> findAllSortedByName();

}
