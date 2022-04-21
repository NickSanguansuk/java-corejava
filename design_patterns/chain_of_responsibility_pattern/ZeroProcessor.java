package design_patterns.chain_of_responsibility_pattern;

public class ZeroProcessor extends Processor {
    public ZeroProcessor(Processor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void process(Number request) {
        if (request.getNumber() == 0)
        {
            System.out.println("ZeroProcessor : " + request.getNumber());
        }
        else
        {
            super.process(request);
        }
    }
}
