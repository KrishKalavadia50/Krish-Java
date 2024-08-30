
<?php

$apiKey = "rzp_test_Lj9djEbMFdUnir";
?>
<script src="https://code.jquery.com/jquery-3.5.0.js"></script>

<form action="thankyou.php" method="POST">
<script
    src="https://checkout.razorpay.com/v1/checkout.js"
    data-key="<?php echo $apiKey;?>" 
    data-amount="<?php echo $_POST['makepayment']*100;?>"
    data-currency="INR"
    data-order_id="<?php echo $_POST['orderid'];?>"
    data-buttontext="Pay with Razorpay"
    data-name="LDRMS"
    data-description="<?php echo $_POST['name'];?>"
    data-image="https://i.pinimg.com/564x/93/3a/3e/933a3e205882d37a70a0559fd5aaaf43.jpg"
    data-prefill.name="<?php echo $_POST['name'];?>" 
    data-theme.color="#000435"
></script>
<input type="hidden" custom="Hidden Element" name="hidden"/>
</form>

<style>
    .razorpay-payment-button { display: none; }
</style>

<script type="text/javascript">
    $(document).ready(function(){
        $('.razorpay-payment-button').click();
    })
</script>
