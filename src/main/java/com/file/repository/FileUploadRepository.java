package com.file.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.file.entity.StudentFile;
@Repository
public interface FileUploadRepository extends JpaRepository<StudentFile, Integer> {

}
