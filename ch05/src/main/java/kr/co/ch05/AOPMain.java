package kr.co.ch05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * ��¥ : 2019/03/06 
 * �̸� : ��α�
 * ���� : AOP �ǽ��ϱ�
 * 
 * ������ AOP
 *  - �ٽɰ��ɰ� ��ü�� ����Ǵ� �������(Ⱦ�ܰ���)�� �и��ؼ� ���α׷����ϴ� ���
 *  
 * �ֿ���
 *  1) ��������Ʈ(JoinPoint)
 *  - �����ϴ� ��� ����Ͻ� �ż���(�ٽɰ���)
 *  
 *  2) ����Ʈ��(Pointcut)
 *  - ��������Ʈ�� ����� �����ϴ� �ٽɸ�
 *  
 *  3) �����̽�(Advice)
 *  - Ⱦ�ܰ��ɿ� �ش��ϴ� ������ �ΰ���ɸ�
 *  
 *  4) ������Ʈ(Aspect)
 *  - ����Ʈ�ư� �����̽��� ����
 *  
 *  5) ����(Weaving)
 *  - ����Ʈ������ ������ �ٽɱ���� ���۵ɶ�, �����̽��� �ش��ϴ� Ⱦ�ܰ��ɸ��� ���ԵǴ� ����
 *  
 *  ����Ʈ�� ǥ����
 *  execution(����Ÿ�� ��Ű����, Ŭ������, �ż����(�Ű�����))
 *  
 *   1) ����Ÿ��
 *    - *		: ��� ����Ÿ�� ���
 *    - void	: ����Ÿ���� void�� �޼���
 *    - !void	: ����Ÿ���� void�� �ƴ� �ż���
 *    
 *   2) ��Ű����
 *   - kr.co.ch1			: �ش� ��Ű�� ���
 *   - kr.co.ch1..			: kr.co.ch1 �� �����ϴ� ��� ��Ű�� ���
 *   - kr.co.ch1..service	: kr.co.ch1 �� �����ؼ� ������ ��Ű���� service�� ������ ��Ű�� ���
 *   
 *   3) Ŭ������
 *   - BoardService	: �ش� Ŭ���� ���
 *   - *Service		: ���̽� service�� ������ Ŭ���� ���
 *   
 *   4) �ż����
 *   - *(..)		: �Ű������� ������ ���� ��� �ż���
 *   - *(*)			: �Ű������� 1�� ���� ��� �ż���
 *   - get*(..)	: �Ű������� ������ ���� �ż��� �̸��� get���� �����ϴ� �ż���
 * 
 */

public class AOPMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		BoardService bs = (BoardService) ctx.getBean("boardService");
		
		bs.insert();
		bs.select();
		bs.update();
		bs.delete();
		
	}
}
