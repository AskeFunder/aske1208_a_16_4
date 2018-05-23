package SorteOpgaver.ch16.aske1208_a_16_4;

import SorteOpgaver.ch16.LinkedIntList;
import SorteOpgaver.ch16.ListNode;

public class four
{
    public int lastIndexOf(int value, LinkedIntList linkedIntList)
    {
        int lastIndex = -1;
        ListNode current = linkedIntList.getFront();

        for (int i = 0; i < linkedIntList.size(); i++)
        {
            if (current.data == value)
            {
                lastIndex = i;
            }
            current = current.next;
        }

        return lastIndex;
    }
}
