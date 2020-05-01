package graphqlServer.service;

import graphqlServer.entity.Student;
import org.springframework.stereotype.Service;
import graphqlServer.repository.StudentRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService (final StudentRepository studentRepository)
    {
        this.studentRepository=studentRepository;
    }

    public Student createStudent(final String name,final Integer grade)
    {
        final Student student = new Student();
        student.setGrade(grade);
        student.setName(name);

        return this.studentRepository.save(student);
    }

    public List<Student> getAllStudents(final int count)
    {
        return this.studentRepository.findAll().stream().limit(count).collect(Collectors.toList());
    }

    public Optional<Student> getStudent(final int id)
    {
        return this.studentRepository.findById(id);
    }
}
