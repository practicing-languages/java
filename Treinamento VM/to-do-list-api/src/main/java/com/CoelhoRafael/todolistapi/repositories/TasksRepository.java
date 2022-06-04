package com.CoelhoRafael.todolistapi.repositories;


import com.CoelhoRafael.todolistapi.models.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
@SuppressWarnings("unused")

public interface TasksRepository extends CrudRepository<Task, UUID> {
}
