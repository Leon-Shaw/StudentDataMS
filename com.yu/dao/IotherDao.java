package dao;

public interface IotherDao {
    // ͳ�ƹ��ܣ�ͳ��ѧ��ĳ��ѧ�ڻ�����ѧ�ڿγ̵���ѧ�֡�
    public double statistic(int sId);

    // �������ܣ���ĳһ���༶��ĳһ�ſγ̵ĳɼ��ֲ����з���������ֱ��ͼ����ʽ��ʾ����
    public int analysis(int stuClass, int cId, int minScore, int maxScore);
}
