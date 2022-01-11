import "./styles.css";
import { ReactComponent as StarFull } from "assets/img/star-full.svg";
import { ReactComponent as StarHalf } from "assets/img/star-half.svg";
import { ReactComponent as StarEmpty } from "assets/img/star-empty.svg";

export default function MovieStars() {
  return (
    <div>
      <div className="dsmovie-stars-container">
        <StarFull />
        <StarFull />
        <StarFull />
        <StarHalf />
        <StarEmpty />
      </div>
    </div>
  );
}
