package br.com.higor.graphqlhibernate;

import br.com.higor.graphqlhibernate.graphql.Mutation;
import br.com.higor.graphqlhibernate.graphql.Query;
import br.com.higor.graphqlhibernate.repository.CommentRepository;
import br.com.higor.graphqlhibernate.repository.PostRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GraphqlHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlHibernateApplication.class, args);
	}

	@Bean
	public Query query(final PostRepository postRepository) {
		return new Query(postRepository);
	}

	@Bean
	public Mutation mutation(PostRepository postRepository, CommentRepository commentRepository) {
		return new Mutation(postRepository, commentRepository);
	}
}
