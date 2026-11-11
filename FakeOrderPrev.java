class FakeOrderPrev {
    private int orderId;
    private String customerId;

    public FakeOrderPrev(int orderId, String customerId) {
        if (orderId < 0) {
            System.out.println("Invalid orderId");
        }
    }
}