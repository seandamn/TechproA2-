<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Hello...</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<style>
  body {
    margin: 0;
    height: 100vh;
    background: #ffffff;
    display: flex;
    justify-content: center;
    align-items: center;
    font-family: Tahoma, Arial, sans-serif;
  }

  input { display: none; }

  .window {
    width: 320px;
    background: #c0c0c0;
    border: 2px solid #000;
    box-shadow: 2px 2px 0 #404040;
    display: none;
  }

  .title {
    background: linear-gradient(to right, #000080, #1084d0);
    color: white;
    padding: 4px 6px;
    font-size: 14px;
    display: flex;
    justify-content: space-between;
    align-items: center;
  }

  .close {
    background: #ff0000;
    border: 1px solid #000;
    width: 16px;
    height: 16px;
    text-align: center;
    font-weight: bold;
    font-size: 12px;
    line-height: 14px;
  }

  .content {
    display: flex;
    gap: 12px;
    padding: 18px;
    color: black;
    font-size: 14px;
  }

  .icon {
    font-size: 28px;
  }

  .buttons {
    display: flex;
    justify-content: center;
    gap: 10px;
    padding: 0 18px 18px;
  }

  .btn, .btn1, .btn2 {
    background: #c0c0c0;
    border: 2px outset #fff;
    padding: 4px 16px;
    cursor: pointer;
    font-size: 13px;
  }

  .btn:active, .btn1:active, .btn2:active {
    border: 2px inset #fff;
  }

  #s1:checked ~ .w1,
  #s2:checked ~ .w2,
  #s3:checked ~ .w3,
  #s4:checked ~ .w4,
  #s5:checked ~ .w5,
  #s7:checked ~ .w7
  {
    display: block;
  }
</style>
</head>
<body>

<input type="radio" name="step" id="s1" checked>
<input type="radio" name="step" id="s2">
<input type="radio" name="step" id="s3">
<input type="radio" name="step" id="s4">
<input type="radio" name="step" id="s5">
<input type="radio" name="step" id="s7">

<!-- Window 1 -->
<div class="window w1">
  <div class="title">
    <span>Hello...</span>
    <div class="close">×</div>
  </div>
  <div class="content">
    <div class="icon">ℹ️</div>
    <div>Honey i create this for you for a long time and i did it, hehehe i want to say HAPPY VALENTINES TO YOU.</div>
  </div>
  <div class="buttons">
    <label for="s2" class="btn">OK</label>
  </div>
</div>

<!-- Window 2 -->
<div class="window w2">
  <div class="title"><span>Hello...</span><div class="close">×</div></div>
  <div class="content"><div class="icon">ℹ️</div>
  <div>Remember before i said i want to create this but i don't pa,' <br> but now I will keep my promise to you<3 </div></div>
  <div class="buttons"><label for="s3" class="btn">OK</label></div>
</div>

<!-- Window 3 -->
<div class="window w3">
  <div class="title"><span>Hello...</span><div class="close">×</div></div>
  <div class="content"><div class="icon">ℹ️</div>
  <div>Happy Valentines Honey i always watching you if kaya mo and natutuwa ako nakakaya mo, 
I'm here to guide you and help you if you need a help, i miss you honey.</div></div>
  <div class="buttons"><label for="s4" class="btn">OK</label></div>
</div>

<!-- Window 4 -->
<div class="window w4">
  <div class="title"><span>Hello...</span><div class="close">×</div></div>
  <div class="content"><div class="icon">ℹ️</div>
  <div>I will protect you forever🥰</div></div>
  <div class="buttons"><label for="s5" class="btn">OK</label></div>
</div>

<!-- Window 5 (Critical Question) -->
<div class="window w5">
  <div class="title"><span>Hello...</span><div class="close">×</div></div>
  <div class="content"><div class="icon">💕</div>
  <div>Critical Question Detected:<br><br>
      You wanna be my one and only for this life?<br>
      And forever be my Honey?</div></div>
  <div class="buttons">
    <button class="btn1" onclick="yesDo()">Yes, I do</button>
    <label for="s7" class="btn2">No</label>
  </div>
</div>

<!-- Window 6 (Yes Message, stops here) -->
<div class="window w6">
  <div class="title"><span>Hello...</span><div class="close">×</div></div>
  <div class="content"><div class="icon">ℹ️</div>
  <div>I'll Screenshot this, Kiss moko nonstop tapos Cuddle!!!, Mwah mwah😘💋💋<br>❤️❤️❤️</div></div>
  <div class="buttons">
    <button class="btn" onclick="this.closest('.window').style.display='none'">OK</button>
  </div>
</div>

<!-- Window 7 (No Message, repeats) -->
<div class="window w7">
  <div class="title"><span>Hello...</span><div class="close">×</div></div>
  <div class="content"><div class="icon">ℹ️</div>
  <div>Hindi mo nako love sana pagalitan ka ni tita.🙄<br>😡😡😡</div></div>
  <div class="buttons"><label for="s1" class="btn">OK</label></div>
</div>

<script>
function yesDo(){
  // show w6
  document.querySelector('.w6').style.display = 'block';
  // hide w5
  document.querySelector('.w5').style.display = 'none';
  // disable radio loop
  document.getElementById('s1').checked = false;
  document.getElementById('s2').checked = false;
  document.getElementById('s3').checked = false;
  document.getElementById('s4').checked = false;
  document.getElementById('s5').checked = false;
}
</script>

</body>
</html>
