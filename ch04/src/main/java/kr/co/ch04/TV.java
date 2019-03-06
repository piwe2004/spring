package kr.co.ch04;
/*
 * ��¥ : 2019/03/05
 * �̸� : ��α�
 * ���� : IOC �ǽ��ϱ�
 * 
 * �̳����̼� ����
 * @Component (@Comtroller, @Service, @Repository)
 *  - ������ �����̳ʰ� �ش� �̳����̼� Ŭ������ ��ü������ ���� �̳����̼�
 * @Autowired
 *  - �ɹ����� �ش� Ÿ�Կ� �´� ��ü�� ���� �޴� �̳����̼�(����������)
 * @Inject
 *  - �ɹ����� �ش� Ÿ�Կ� �´� ��ü�� ���� �޴� �̳����̼�(��������)
 * @Resource(name="��ü���̵�")
 *  - ������(��ü)���ԵǴ� ��ü�� 2�� �̻��϶� ���̵� �����ؼ� �����ϴ� �̳����̼�
 */
public interface TV {
	public void power();
	public void chUp();
	public void chDown();
	public void VolumeUp();
	public void VolumeDown();
	public void connect();
	public void disconnect();
}
