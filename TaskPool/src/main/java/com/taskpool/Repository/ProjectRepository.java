package com.taskpool.Repository;

import com.taskpool.Domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 14437 on 2018/1/27.
 */
public interface ProjectRepository extends JpaRepository<Project,Integer>{

}
