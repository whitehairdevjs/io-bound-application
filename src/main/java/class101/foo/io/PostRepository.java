//package class101.foo.io;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public interface PostRepository extends JpaRepository<Post, Long> {
//    List<Post> findByContentContains(String content);
//}
package class101.foo.io;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends ElasticsearchRepository<Post, String> {
    List<Post> findByContent(String content);
}