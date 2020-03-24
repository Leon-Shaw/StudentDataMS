package dao;

import domain.Course;
import java.util.List;

public interface ICourseDao {
    /**
     * ����һ�ſγ�
     */
    public void save(Course course);
    /**
     * ɾ��һ�ſγ�
     */
    public void delete(int cId);
    /**
     * �޸�һ�ſγ�
     */
    public void update(int cId, Course course);
    /**
     * ��ѯĳ�ſ�
     */
    public Course get(int cId);
    /**
     * ��ѯ���п�
     */
    public List<Course> getAll();

}
