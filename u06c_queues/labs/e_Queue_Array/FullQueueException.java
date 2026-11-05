package queue;

class FullQueueException extends RuntimeException
{

    public FullQueueException()
    {
    }

    public FullQueueException(String s)
    {
        super(s);
    }
}

