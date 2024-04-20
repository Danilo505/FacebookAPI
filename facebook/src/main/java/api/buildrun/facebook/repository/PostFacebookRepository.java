package api.buildrun.facebook.repository;

import api.buildrun.facebook.entities.PostFacebook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostFacebookRepository extends JpaRepository<PostFacebook, Long> {
}
