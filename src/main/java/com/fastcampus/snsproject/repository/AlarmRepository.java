package com.fastcampus.snsproject.repository;

import com.fastcampus.snsproject.model.entity.AlarmEntity;
import com.fastcampus.snsproject.model.entity.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AlarmRepository extends JpaRepository<AlarmEntity, Long> {

    Page<AlarmEntity> findAllByUser(UserEntity userEntity, Pageable pageable);
}
