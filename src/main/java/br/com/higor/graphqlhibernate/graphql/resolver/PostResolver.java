package br.com.higor.graphqlhibernate.graphql.resolver;

import br.com.higor.graphqlhibernate.entity.Comment;
import br.com.higor.graphqlhibernate.entity.Post;
import br.com.higor.graphqlhibernate.repository.CommentRepository;
import com.coxautodev.graphql.tools.GraphQLResolver;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
@Slf4j
public class PostResolver implements GraphQLResolver<Post> {

    private final CommentRepository commentRepository;

    /**
     * Resolver to comments field in type Post
     * @param post
     * @return
     */
    public List<Comment> comments(Post post){
        return commentRepository.findAllByPostId(post.getId());
    }
}
