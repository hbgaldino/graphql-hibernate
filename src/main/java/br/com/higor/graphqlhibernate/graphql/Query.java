package br.com.higor.graphqlhibernate.graphql;

import br.com.higor.graphqlhibernate.entity.Post;
import br.com.higor.graphqlhibernate.repository.PostRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Transactional
@RequiredArgsConstructor
public class Query implements GraphQLQueryResolver {

    private final PostRepository postRepository;

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public Post getPost(Long id) {
        return postRepository.findById(id).orElse(null);
    }

}
