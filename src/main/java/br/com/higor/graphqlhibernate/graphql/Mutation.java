package br.com.higor.graphqlhibernate.graphql;

import br.com.higor.graphqlhibernate.entity.Post;
import br.com.higor.graphqlhibernate.repository.PostRepository;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Mutation implements GraphQLMutationResolver {

    private PostRepository postRepository;

    public Post createPost(String title) {
        Post post = new Post();
        post.setTitle(title);
        return postRepository.save(post);
    }
}
