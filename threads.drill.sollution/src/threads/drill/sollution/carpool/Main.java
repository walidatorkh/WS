package threads.drill.sollution.carpool;

public class Main {

	public static void main(String[] args) {

		// ����� ����� �����
		int drivingDistance;

		// ����� ���� 5 ��������
		for (int i = 1; i <= 5; i++) {
			// ����� ����� �� ���� �����
			drivingDistance = (int) (Math.random() * 6);
			// ����� ��� �� �� ������
			Thread d = new Thread(new CarDriver(drivingDistance), "d" + i);
			// ����� ����
			d.start();
		}

	}
}
