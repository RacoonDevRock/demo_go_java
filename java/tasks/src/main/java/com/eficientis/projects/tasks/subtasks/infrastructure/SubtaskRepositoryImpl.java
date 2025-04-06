package com.eficientis.projects.tasks.subtasks.infrastructure;

import com.eficientis.projects.tasks.subtasks.domain.Subtask;
import com.eficientis.projects.tasks.subtasks.domain.SubtaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class SubtaskRepositoryImpl implements SubtaskRepository {
    private final JPASubtaskRepository jpaSubtaskRepository;

    @Override
    public Subtask save(Subtask subtask) {
        SubtaskEntity entity = new SubtaskEntity(subtask.getId(), subtask.getTitle(), subtask.isCompleted());
        return toDomain(jpaSubtaskRepository.save(entity));
    }

    @Override
    public List<Subtask> findAll() {
        return jpaSubtaskRepository.findAll().stream().map(this::toDomain).collect(Collectors.toList());
    }

    @Override
    public Optional<Subtask> findById(UUID id) {
        return jpaSubtaskRepository.findById(id).map(this::toDomain);
    }

    @Override
    public void deleteById(UUID id) {
        jpaSubtaskRepository.deleteById(id);
    }

    @Override
    public Subtask updateCompletion(UUID id, boolean completed) {
        SubtaskEntity entity = jpaSubtaskRepository.findById(id).orElseThrow(() -> new RuntimeException("Subtarea no encontrada"));

        entity.setCompleted(completed);

        return toDomain(jpaSubtaskRepository.save(entity));
    }

    private Subtask toDomain(SubtaskEntity entity) {
        return new Subtask(entity.getId(), entity.getTitle(), entity.isCompleted());
    }
}
