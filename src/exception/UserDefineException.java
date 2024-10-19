package exception;
class VoteException extends Exception {

	public VoteException(String msg) {
		super(msg);
	}
}



public class UserDefineException {
	void CheckAgeForVote(int age) throws VoteException{
		if(age<18) {
			throw new VoteException("Invalid age for Vote");
		}
		else
		{
			System.out.println("welcome to Vote");
		}
	}

	public static void main(String[] args) {
		UserDefineException a=new UserDefineException();
		try {
			a.CheckAgeForVote(3);
		
		}
		catch (VoteException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("end of vote code");
		}

	}

}
