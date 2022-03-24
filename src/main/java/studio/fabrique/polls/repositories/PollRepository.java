package studio.fabrique.polls.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import studio.fabrique.polls.domain.Poll;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PollRepository extends JpaRepository<Poll, Long> {
    public List<Poll> findAllByStartDateLessThanEqualAndEndDateGreaterThanEqual(LocalDateTime startDate,LocalDateTime endDate);
}