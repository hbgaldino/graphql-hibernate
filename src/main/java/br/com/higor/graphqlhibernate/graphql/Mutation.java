package br.com.higor.graphqlhibernate.graphql;

import br.com.higor.graphqlhibernate.entity.Comment;
import br.com.higor.graphqlhibernate.entity.Post;
import br.com.higor.graphqlhibernate.repository.CommentRepository;
import br.com.higor.graphqlhibernate.repository.PostRepository;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Mutation implements GraphQLMutationResolver {

    private PostRepository postRepository;
    private CommentRepository commentRepository;

    public Post createPost(String title) {
        Post post = new Post();
        post.setTitle(title);
        return postRepository.save(post);
    }

    public Comment commentPost(Long id, String comment) {
        Comment entity = new Comment();
        entity.setPostId(id);
        entity.setComment(comment);
        entity.setUsername("Admin");
        return commentRepository.save(entity);
    }
}
