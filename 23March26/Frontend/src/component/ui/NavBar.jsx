import { useState } from "react";
import Aboutus from "./Aboutus";

function NavBar() {
  const [showAbout, setShowAbout] = useState(false);
  const aboutus = () => {
    setShowAbout(!showAbout);
  };
  return (
    <>
      <div className="flex justify-between px-5 py-5 bg-emerald-400">
        <div className="flex gap-5 cursor-pointer">
          <div>LOGO</div>
          <div>My company</div>
        </div>
        <div className="flex gap-5">
          <div>Home</div>
          <div className="cursor-pointer" onClick={aboutus}>
            About
          </div>
          <div>Services</div>
          <div>Products</div>
          <div>Contact us</div>
        </div>
        <div className="flex gap-5">
          <div>Login</div>
          <div>Sign up</div>
        </div>
        <div>{showAbout && <Aboutus />}</div>
      </div>
    </>
  );
}
export default NavBar;
