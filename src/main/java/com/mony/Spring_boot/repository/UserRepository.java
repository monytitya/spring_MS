package com.mony.Spring_boot.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Repository;

import com.mony.Spring_boot.model.User;

@Repository
public class UserRepository {
    private final Map<Long, User> users = new ConcurrentHashMap<>();
    private final AtomicLong idCounter = new AtomicLong(0);

    public List<User> findAll() {
        return new ArrayList<>(users.values());
    }

    public Optional<User> findById(Long id) {
        return Optional.ofNullable(users.get(id));
    }

    public User save(User user) {
        if (user.getId() == null) {
            user.setId(idCounter.incrementAndGet());
        }
        users.put(user.getId(), user);
        return user;
    }

    public void deleteById(Long id) {
        users.remove(id);
    }

    public boolean existsById(Long id) {
        return users.containsKey(id);
    }
}
