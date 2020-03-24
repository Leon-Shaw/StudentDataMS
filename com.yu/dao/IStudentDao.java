package dao;

import domain.Student;
import java.util.List;

public interface IStudentDao {
    /**
     * ����һ��ѧ��
     */
    public void save(Student stu);
    /**
     * ɾ��ѧ��
     */
    public void delete(int sId);
    /**
     * ����һ��ѧ����Ϣ
     */
    public void update(int id,Student stu);
    /**
     * ��ȡָ��ѧ��
     */
    public Student get(int sId);
    /**
     * ��ȡ���е�ѧ��
     */
    public List<Student> getAll();
}
