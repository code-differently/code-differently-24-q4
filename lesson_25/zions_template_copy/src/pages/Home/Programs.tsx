export default function Programs({
  title,
  description,
}: {
  title: string;
  description: string;
}) {
  return (
    <>
      <li className="program">
        <h3>{title}</h3>

        <p>{description}</p>
      </li>
    </>
  );
}
