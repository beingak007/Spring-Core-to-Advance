package in.akash.dao;

import java.util.List;

import in.akash.bo.StudentBO;

public interface IStudentDAO {
	public int insert(StudentBO s);

	public void delete(int id);

	public void delete(StudentBO s);

	public void update(StudentBO s);

	public StudentBO getStudent(int id);

	public List<StudentBO> getAllStudents();
}
