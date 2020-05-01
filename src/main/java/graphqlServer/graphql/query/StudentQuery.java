package graphqlServer.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import graphqlServer.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import graphqlServer.service.StudentService;

import java.util.List;
import java.util.Optional;

@Component
public class StudentQuery implements GraphQLQueryResolver {

    @Autowired
    private StudentService studentService;

    public List<Student> getStudents(final int count)
    {
        return this.studentService.getAllStudents(count);
    }

    public Optional<Student> getStudent(final int id){
        return this.studentService.getStudent(id);
    }
}
