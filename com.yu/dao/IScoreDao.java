package dao;

import domain.Score;
import java.util.List;

public interface IScoreDao {
    /**
     * ����ѧ���ɼ�
     */
    public void save(int sId, int cId,Score score);
    /**
     * ɾ��ѧ���ɼ�
     */
    public void delete(int sId, int cId);
    /**
     * ����ѧ���ɼ�
     */
    public void update(int sId, Score score);
    /**
     * ����ѧ�Ż�ȡѧ���ɼ�
     */
    public Score get(int sId, int cId);
    /**
     * ��ȡȫ��ѧ���ɼ�
     */
    public List<Score> getAll();

}
