package graphqlServer.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import graphqlServer.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import graphqlServer.service.StudentService;

@Component
public class StudentMutation implements GraphQLMutationResolver {

    @Autowired
    private StudentService studentService;

    public Student createStudent(final String name, final Integer grade)
    {
        return this.studentService.createStudent(name,grade);
    }
}
