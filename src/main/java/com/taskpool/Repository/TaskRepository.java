package com.taskpool.Repository;

import com.taskpool.Domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 14437 on 2018/1/27.
 */
public interface TaskRepository extends JpaRepository<Task,Integer>{
}
