package android.app;

public interface IZtevrManager {
	boolean vrSetSingleBuf(int open);
	boolean vrenableVRMode(int mode);
	void vrdefaultFreq();
	void vrfullFreq();
	String vrManagerVersion();
	String vrOVRVersion();
	boolean setThreadSchedFifo(String pkg, int pid, int tid, int prio);
}