package web.example.cbt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import web.example.cbt.model.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Long> {

}
