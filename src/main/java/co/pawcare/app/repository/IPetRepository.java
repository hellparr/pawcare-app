package co.pawcare.app.repository;

import co.pawcare.app.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPetRepository extends JpaRepository<Pet, Long> {

}
