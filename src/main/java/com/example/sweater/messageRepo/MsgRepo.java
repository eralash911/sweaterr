package com.example.sweater.messageRepo;

import com.example.sweater.domain.Message;
import org.springframework.data.repository.CrudRepository;
import sun.misc.resources.Messages;

import java.util.List;

public interface MsgRepo extends CrudRepository<Message, Long> {
    List<Message> findByTag(String tag);
}
