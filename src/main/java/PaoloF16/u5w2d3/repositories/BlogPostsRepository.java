package PaoloF16.u5w2d3.repositories;

import PaoloF16.u5w2d3.entities.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogPostsRepository extends JpaRepository<BlogPost, Long> {
}