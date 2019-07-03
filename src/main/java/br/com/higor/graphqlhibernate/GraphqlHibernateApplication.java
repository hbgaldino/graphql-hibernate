package br.com.higor.graphqlhibernate;

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
	public Query query(PostRepository postRepository, CommentRepository commentRepository) {
		return new Query(postRepository, commentRepository);
	}
}
