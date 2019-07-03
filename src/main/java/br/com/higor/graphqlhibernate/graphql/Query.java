package br.com.higor.graphqlhibernate.graphql;

import br.com.higor.graphqlhibernate.entity.Comment;
import br.com.higor.graphqlhibernate.entity.Post;
import br.com.higor.graphqlhibernate.repository.CommentRepository;
import br.com.higor.graphqlhibernate.repository.PostRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@AllArgsConstructor
@Slf4j
public class Query implements GraphQLQueryResolver {

    private PostRepository postRepository;
    private CommentRepository commentRepository;

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public Post getPost(Long id) {
        return postRepository.findById(id).orElse(null);
    }

    public List<Comment> getPostComment(Integer id) {
        return commentRepository.findAllByPostId(id);
    }
}
