package jana60.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import jana60.model.Courses;

@Repository
public interface CoursesRepository extends CrudRepository<Courses, Integer> {

}