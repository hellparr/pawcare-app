package co.pawcare.app.repository;

import co.pawcare.app.entity.Veterinarian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVeterinarianRepository extends JpaRepository <Veterinarian, Long> {
}
